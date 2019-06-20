package com.spring.config.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WolfConfig {

	@Bean
	public Wolf getWolf()
	{
		Wolf w = new Wolf();
		w.setName("wertyu");
		w.setColor("asdfghj");
		return w;
	}
}