package com.tech.mkblogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbOpenTracingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbOpenTracingApplication.class, args);
	}
	
	/*
	@Bean
	public static JaegerTracer getTracer() {
	    Configuration.SamplerConfiguration samplerConfig = Configuration.SamplerConfiguration.fromEnv().withType("const").withParam(1);
	    Configuration.ReporterConfiguration reporterConfig = Configuration.ReporterConfiguration.fromEnv().withLogSpans(true);
	    Configuration config = new Configuration("jaeger tutorial").withSampler(samplerConfig).withReporter(reporterConfig);
	    return config.getTracer();
	}
	*/
	/*
	 * @Bean public io.opentracing.Tracer jaegerTracer() {
	 * 
	 * Configuration config = Configuration.fromEnv();
	 * System.out.println("Config_Host: " +
	 * config.getReporter().getSenderConfiguration().getAgentHost());
	 * System.out.println("Config_Port: " +
	 * config.getReporter().getSenderConfiguration().getAgentPort());
	 * System.out.println("Sampler_Host_Port: " +
	 * config.getSampler().getManagerHostPort());
	 * 
	 * return config.getTracer(); }
	 */

}
