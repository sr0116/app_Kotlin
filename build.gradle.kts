plugins {
  kotlin("jvm") version "1.9.25"
  kotlin("plugin.spring") version "1.9.25"
  id("org.springframework.boot") version "3.5.5"
  id("io.spring.dependency-management") version "1.1.7"
  kotlin("plugin.jpa") version "1.9.25"
}

group = "com.imchobo"
version = "0.0.1-SNAPSHOT"
description = "kotlin_ex"

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
  }
}

configurations {
  compileOnly {
    extendsFrom(configurations.annotationProcessor.get())
  }
}

repositories {
  mavenCentral()
}

dependencies {
  // 웹
  implementation("org.springframework.boot:spring-boot-starter-web")

  // JPA
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")

  // Kotlin 필수
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("org.jetbrains.kotlin:kotlin-reflect")

  // Validation (DTO, Entity 유효성 검사)
  implementation("org.springframework.boot:spring-boot-starter-validation")

  // 개발 편의
  developmentOnly("org.springframework.boot:spring-boot-devtools")

  // H2 (테스트/학습용)
  runtimeOnly("com.h2database:h2")

  // 테스트
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}


kotlin {
  compilerOptions {
    freeCompilerArgs.addAll("-Xjsr305=strict")
  }
}

allOpen {
  annotation("jakarta.persistence.Entity")
  annotation("jakarta.persistence.MappedSuperclass")
  annotation("jakarta.persistence.Embeddable")
}

tasks.withType<Test> {
  useJUnitPlatform()
}
