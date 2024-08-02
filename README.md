# Templating Engine in Kotlin

Templating engines are used to generate dynamic content by combining static templates with dynamic data. Kotlin, being a versatile language, supports various templating engines. This documentation provides a summary of using different templating engines in Kotlin, including Mustache, Thymeleaf, Freemarker, and Pebble.

<img width="1398" alt="Screenshot 2024-08-02 at 09 10 01" src="https://github.com/user-attachments/assets/7e7eb0e0-5fc4-4e25-a00f-844c3003d8ec">

## Requirements

- IntelliJ IDEA
- Kotlin
  
## Mustache
### Overview
Mustache is a logic-less template engine for creating dynamic content. It uses placeholders within double curly braces.
### Setup
Add the dependency to your build.gradle.kts:
```bash
 implementation("com.github.spullara.mustache.java:compiler:0.9.7")
```
Official Documentation: https://mustache.github.io/mustache.5.html

## FreeMarker
### Overview
FreeMarker is a template engine designed for generating HTML pages, configuration files, source code, etc.
### Setup
Add the dependency to your build.gradle.kts:
```bash
 implementation("org.freemarker:freemarker:2.3.31")
```
Official Documentation: https://freemarker.apache.org/

## Pebble
### Overview
Pebble is a Java templating engine inspired by Twig and aimed at providing a clean, intuitive syntax.
### Setup
Add the dependency to your build.gradle.kts:
```bash
  implementation("io.pebbletemplates:pebble:3.1.5")
```
Official Documentation: https://pebbletemplates.io/

## Using
1. **Clone Repository**:
   ```bash
   git clone https://github.com/muhammadridwan47/template-engine-kotlin.git
   cd template-engine-kotlin
2. Open IntelliJ IDEA and then Import the project

## Struktur Proyek
<img width="322" alt="Screenshot 2024-08-02 at 09 23 04" src="https://github.com/user-attachments/assets/5fd80d0b-5503-44dd-adef-c1b75a9fa4ff">


