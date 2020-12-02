package com.david.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * @see [https://spring.io/guides/gs/batch-processing/]
 * 
 */
@SpringBootApplication
public class BatchApplication {

  public static void main(String[] args) {
    //SpringApplication.run(BatchApplication.class, args);
    System.exit(SpringApplication.exit(SpringApplication.run(BatchApplication.class, args)));
  }

}
