package com.lian.supplierandwholesalerlian.infrastructure.configuration;

import com.lian.supplierandwholesalerlian.domain.api.ISubcategoryServicePort;
import com.lian.supplierandwholesalerlian.domain.spi.ISubcategoryPersistencePort;
import com.lian.supplierandwholesalerlian.domain.useCase.SubcategoryUseCase;
import com.lian.supplierandwholesalerlian.infrastructure.output.jpa.adapter.SubcategoryJpaAdapter;
import com.lian.supplierandwholesalerlian.infrastructure.output.jpa.mapper.SubcategoryEntityMapper;
import com.lian.supplierandwholesalerlian.infrastructure.output.jpa.repository.ISubcategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ISubcategoryRepository subcategoryRepository;
    private final SubcategoryEntityMapper subcategoryEntityMapper;

    @Bean
    public ISubcategoryPersistencePort subcategoryPersistencePort(){
        return new SubcategoryJpaAdapter(subcategoryRepository, subcategoryEntityMapper);
    }

    @Bean
    public ISubcategoryServicePort subcategoryServicePort(){
        return new SubcategoryUseCase(subcategoryPersistencePort());
    }

}
