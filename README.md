# 💱 Conversor de Monedas en Java

Este proyecto fue desarrollado como parte del **Challenge de Alura LATAM**, enfocado en el desarrollo de un conversor de monedas utilizando **Java** como lenguaje de programación. Forma parte del proceso de formación en la especialización de **Desarrollo Backend con Java**.

## 🚀 Descripción del proyecto

El conversor permite transformar montos entre diferentes monedas utilizando tasas de cambio en tiempo real. Para lograrlo, se integra con la API pública de **[Exchange Rate API](https://www.exchangerate-api.com/)**, que proporciona datos actualizados y confiables de manera gratuita.

El usuario puede:

- Seleccionar una moneda de origen (por ejemplo: `USD`)
- Seleccionar una moneda destino (por ejemplo: `COP`)
- Ingresar la cantidad a convertir
- Visualizar el resultado exacto según la tasa de cambio actual

## 🔐 Seguridad y manejo de API Key

Para mantener segura tu clave personal de API, se implementó el uso de un archivo `.env` que **no se sube al repositorio**. Esto protege tus credenciales en entornos públicos como GitHub.

### ¿Cómo configurar la clave API?

1. Crea un archivo `.env` en la raíz del proyecto.
2. Dentro del archivo, añade tu clave así:


EXCHANGE_API_KEY=tu_clave_aquí
Asegúrate de que el archivo .env esté listado dentro de .gitignore para que no se suba a GitHub.

📦 Librería utilizada para manejar variables de entorno
java-dotenv: permite cargar variables desde .env al entorno de ejecución de Java.

🔗 ¿Por qué elegimos Exchange Rate API?
📈 Tasas de cambio en tiempo real

✅ Datos precisos y confiables

💸 Gratuita para uso básico

⚙️ Fácil de integrar mediante peticiones HTTP

Esta API garantiza acceso eficiente a la información financiera esencial para realizar conversiones rápidas y precisas.

🛠️ Tecnologías utilizadas
☕ Java 17

📡 HTTP Client (java.net.http)

🔄 Gson (para deserializar JSON)

🔐 Dotenv (para manejar variables de entorno)

🧪 Scanner (entrada de datos por consola)

💻 IDE: IntelliJ IDEA

🧠 Funcionalidades extra implementadas
Validación de monedas soportadas

Interacción por consola con menú personalizado

Lectura segura de API Key desde .env

Código modular y organizado en paquetes:

Main

Services

Models
```
📁 Estructura del proyecto


├── .env                 # Clave privada de API (NO se sube al repositorio)
├── .gitignore           # Ignora archivos sensibles como .env
├── pom.xml              # Configuración del proyecto Maven
└── src
    └── main
        ├── java
        │   └── com.moonsolution.conversormonedas
        │       ├── Main
        │       │   └── Main.java
        │       ├── Models
        │       │   └── DatosConversion.java
        │       └── Services
        │           └── ConsultaApi.java
        └── resources
        
```
👨‍💻 Desarrollado por
Jose David Carranza Angarita
Desarrollador Backend en formación.

🐙 GitHub: @josedavd-07

🔗 LinkedIn: Jose David Carranza Angarita

📧 Email: ing.josedavidcarranzaangarita@gmail.com

✨ “Aprender haciendo” es el mejor camino para dominar la programación.
— Alura LATAM & Oracle Next Education

---
