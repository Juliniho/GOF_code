/*
 * Created on 4 mar 2017 ( Time 18:53:36 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package org.demo;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.demo.validator.TPhoneValidator;
import org.demo.validator.TPersonValidator;
import org.demo.validator.TIdCardValidator;

/**
 * Application configuration.
 * ( messages resources, validators)
 * @author Telosys Tools Generator
 *
 */
@Configuration
@ComponentScan(basePackageClasses = ApplicationConfig.class)
@EnableWebMvc
public class ApplicationConfig extends RepositoryRestMvcConfiguration {

    /**
     * Message Ressource declaration.
     * @return MessageRessource
     */
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("i18n/messages");
        source.setUseCodeAsDefaultMessage(true);
        return source;
    }

   /**
     * Validator declaration for TPhone
     * @return the TPhoneValidator
     */
    @Bean
    public TPhoneValidator beforeCreateTPhoneValidator() {
        return new TPhoneValidator();
    }
   /**
     * Validator declaration for TPerson
     * @return the TPersonValidator
     */
    @Bean
    public TPersonValidator beforeCreateTPersonValidator() {
        return new TPersonValidator();
    }
   /**
     * Validator declaration for TIdCard
     * @return the TIdCardValidator
     */
    @Bean
    public TIdCardValidator beforeCreateTIdCardValidator() {
        return new TIdCardValidator();
    }



}