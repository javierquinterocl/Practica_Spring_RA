# Proyecto Playground Spring BootPractica de CRUD basico con Spring Boot


## Estructura de Carpetas


## Instrucciones

1. **GET - Listar todos los caprinos**
    - **Método:** GET
    - **Endpoint:**
      ```
      http://localhost:8080/salas/goats
      ```
    - **Respuesta esperada:** lista de cabras registradas.

2. **POST - Agregar un nuevo caprino**
    - **Método:** POST
    - **Endpoint:**
      ```
      http://localhost:8080/salas/goats?id=1&nombre=Luna&edad=2&raza=Boer&peso=35
      ```
    - **Respuesta esperada:**
      ```
      Caprino agregado: Luna
      ```

3. **PUT - Actualizar un caprino existente**
    - **Método:** PUT
    - **Endpoint:**
      ```
      http://localhost:8080/salas/goats/0?id=1&nombre=Luna&edad=3&raza=Boer&peso=40
      ```
    - **Respuesta esperada:**
      ```
      Caprino actualizado en índice 0: Luna
      ```

4. **DELETE - Eliminar un caprino**
    - **Método:** DELETE
    - **Endpoint:**
      ```
      http://localhost:8080/salas/goats/0
      ```
    - **Respuesta esperada:**
      ```
      Caprino eliminado: Luna
      ```

---