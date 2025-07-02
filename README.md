# Patrones de Diseño en Java con Spring Boot

Este repositorio contiene ejemplos prácticos de patrones de diseño aplicados en un proyecto Java usando Spring Boot.

## Que son los patrones de diseño

Son soluciones a problemas comunes.

## 🎯 Patrón Facade (Fachada)

### 🧩 Descripción

El patrón **Facade** simplifica la complejidad que pueda tener nuestra aplicación, para que el cliente solo tenga un punto de acceso facil, sin que sepa su implementacion interna.
Este patrón oculta la complejidad del sistema subyacente  y expone solo lo necesario al cliente.

En el contexto de una aplicación Spring Boot, un **Facade** se implementa típicamente como una clase que centraliza y orquesta llamadas a múltiples servicios, actuando como
un intermediario entre el controlador y los componentes de negocio o infraestructura.

### ✅ Objetivos

- Simplificar el acceso a sistemas complejos.
- Reducir el acoplamiento entre las capas.
- Centralizar la lógica de orquestación.
- Mejorar la mantenibilidad y testabilidad del sistema.

### 🏗️ Estructura

```text
Controller --> Facade --> Servicios / Repositorios / APIs externas
