<<<<<<< HEAD
[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/REoynm-T)
# Actividad en clase: Diagrama de base de datos

En esta actividad tendrán que modelar la base de datos planteada en este documento usando la libería de Spring Data JPA. Para esto, deben crear las clases de entidad correspondientes a cada tabla, definiendo las relaciones entre ellas utilizando anotaciones como `@OneToMany`, `@ManyToOne`, `@ManyToMany`, etc.

Posterior a esto, deberán generar con ayuda de la IAG datos de prueba para cada una de las tablas, asegurándose de que las relaciones entre ellas se mantengan correctamente. Para ello usarán el archivo `data.sql` ubicado en el directorio `src/main/resources` de su proyecto Spring Boot. Este archivo se ejecutará automáticamente al iniciar la aplicación, insertando los datos de prueba en la base de datos.

Finalmente, deberán hacer algunas consultas a la base de datos para verificar que los datos se han insertado correctamente y que las relaciones entre las tablas funcionan como se espera. Las consultas serán las siguientes:

1. Obtener todas las encuestas junto con sus secciones y preguntas.
2. Obtener todas las respuestas de una entrevista específica.
3. Obtener todas las opciones disponibles para una pregunta específica.
4. Obtener todas las preguntas de una encuesta.
5. Obtener todas los resultados de una encuesta ordenadas por fecha
6. Obtener preguntas por tipo
7. Buscar encuestas por nombre (like)
8. Obtener respuestas de una pregunta específica en todas las entrevistas
9. Obtener secciones raíz (que no tienen sección padre) de una encuesta específica.
10. Obtener las opciones de un grupo específico.
11. Obtener todas las opciones de una pregunta consultada través de la tabla `option_question`.
12. Obtener la primera entrevista realizada para una encuesta específica.
13. Obtener el número total de entrevistas realizadas para cada encuesta.
14. Comprobar si existe alguna entrevista realizada por un entrevistador específico.
15. Obtener todas las preguntas de un tipo específico (por ejemplo, todas las preguntas de tipo "multiple choice").


```bash
// ========================
// TABLES
// ========================

Table survey {
  id int [pk]
  name varchar
  intro text
  validation varchar
  image_url varchar
  outro text
  styles text
}

Table section {
  id int [pk]
  title varchar
  description text
  flag varchar
  order_col int
  section_id int
  type varchar
  survey_id int
  background_image varchar
}

Table question {
  id int [pk]
  name varchar
  question_id int
  type varchar
  section_id int
  order_col int
}

Table option {
  id int [pk]
  name varchar
  type varchar
  group_id int
}

Table option_group {
  id int [pk]
  name varchar
}

Table option_question {
  id int [pk]
  question_id int
  option_id int
  group_id int
}

Table answer {
  id int [pk]
  answer text
  question_id int
  interview_id int
}

Table interview {
  id int [pk]
  time_start timestamp
  survey_id int
  interviewer_id int
  time_end timestamp
  username varchar
  institution_id int
}

Table type {
  id int [pk]
  name varchar
  description text
  table_name varchar
}

// ========================
// RELATIONSHIPS
// ========================

Ref: section.survey_id > survey.id
Ref: section.section_id > section.id

Ref: question.section_id > section.id
Ref: question.question_id > question.id

Ref: option.group_id > option_group.id

Ref: option_question.question_id > question.id
Ref: option_question.option_id > option.id
Ref: option_question.group_id > option_group.id

Ref: answer.question_id > question.id
Ref: answer.interview_id > interview.id

Ref: interview.survey_id > survey.id

Ref: question.type > type.name
```
=======
# ParcialCompunet2
# 📘 Guía básica de Git en Linux

Esta guía explica los comandos esenciales de Git para trabajar con repositorios en un entorno Linux usando la terminal. Incluye cómo clonar, guardar cambios, subirlos y manejar ramas en GitHub.

---

## 🧩 1. Clonar un repositorio

Para descargar un proyecto desde GitHub:

```bash
git clone https://github.com/usuario/repositorio.git
```

Entrar a la carpeta del proyecto:

```bash
cd repositorio
```

---

## 🧩 2. Ver el estado del repositorio

Muestra los archivos modificados o pendientes:

```bash
git status
```

---

## 🧩 3. Agregar cambios (staging)

Agregar todos los archivos modificados:

```bash
git add .
```

Agregar un archivo específico:

```bash
git add nombre_archivo
```

---

## 🧩 4. Guardar cambios (commit)

Guardar los cambios con un mensaje descriptivo:

```bash
git commit -m "Descripción de los cambios"
```

---

## 🧩 5. Subir cambios a GitHub

Subir cambios a la rama principal:

```bash
git push origin main
```

---

## 🧩 6. Traer cambios del repositorio remoto

Actualizar tu repositorio local:

```bash
git pull origin main
```

---

## 🌿 7. Manejo de ramas

### Crear una nueva rama:

```bash
git branch nombre-rama
```

### Cambiar de rama:

```bash
git checkout nombre-rama
```

### Crear y cambiar a una rama en un solo paso:

```bash
git checkout -b nombre-rama
```

### Ver todas las ramas:

```bash
git branch
```

---

## 🔀 8. Fusionar ramas (merge)

Desde la rama principal (main):

```bash
git merge nombre-rama
```

---

## ❌ 9. Resolver conflictos

Cuando hay conflictos:

1. Editar los archivos con conflicto
2. Guardar cambios
3. Ejecutar:

```bash
git add .
git commit -m "Resolución de conflictos"
```

---

## 🔗 10. Configurar repositorio remoto

Agregar repositorio remoto:

```bash
git remote add origin https://github.com/usuario/repositorio.git
```

Ver repositorios remotos:

```bash
git remote -v
```

Cambiar URL del repositorio remoto:

```bash
git remote set-url origin NUEVA_URL
```

---

## 🧹 11. Otros comandos útiles

### Ver historial de commits:

```bash
git log
```

### Ver cambios en archivos:

```bash
git diff
```

### Eliminar una rama:

```bash
git branch -d nombre-rama
```

---

## 🔐 12. Autenticación

En GitHub, se recomienda usar un **token personal (PAT)** en lugar de contraseña.

---

## 🚀 Flujo de trabajo básico

```bash
git pull origin main
git add .
git commit -m "Cambios realizados"
git push origin main
```

---

## 📌 Recomendaciones

* Escribir mensajes de commit claros
* Hacer `git pull` antes de `push`
* Trabajar con ramas para nuevas funcionalidades
* Evitar usar `--force` a menos que sea necesario

---

✨ Con estos comandos puedes manejar completamente un proyecto con Git en Linux.
