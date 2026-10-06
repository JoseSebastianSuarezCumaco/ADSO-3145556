# Informe 2 — Commits en los repositorios en los que trabajaste

**Periodo:** del 1 al 30 de septiembre de 2026 (hora Colombia, UTC-5)
**Repositorio principal de la ficha:** https://github.com/code-sena/ADSO-3145556

| Campo | Valor |
|---|---|
| Aprendiz | Jose Sebastian Suarez Cumaco |
| Usuario de GitHub | JoseSebastianSuarezCumaco |
| Ficha | ADSO-3145556 |
| Proyecto (equipo) | woman-alert |
| Correo(s) con el que haces commit | masquebugs1@gmail.com |
| Fecha de elaboración | 6 de octubre de 2026 |

<details>
<summary><strong>Instrucciones — léelas y borra este bloque antes de entregar</strong></summary>

**Qué reporta este informe.** Todos los commits que hiciste en **los demás repositorios en los que trabajaste**: tu repositorio personal o de perfil, tu fork de `ADSO-3145556`, repositorios de otros equipos, `design-software` y cualquier otro. **No repitas aquí** los repositorios de tu equipo (`-docs`, `-api`, `-app`, `-db`, `-portal`, `-worker`): esos van en el Informe 1.

**Tipos de repositorio** (úsalos en la columna *Tipo*): `Personal` · `Fork de la ficha` · `Otro equipo` · `design-software` · `Otro`.

**Paso 1 — descubre en qué repositorios trabajaste.** Elige una de las dos formas (reemplaza `TU_USUARIO`):

- *Desde el navegador:* abre
  `https://github.com/search?q=author%3ATU_USUARIO+author-date%3A2026-08-01..2026-08-30&type=commits`
  y mira en qué repositorios aparecen tus commits.
- *Desde la terminal* (requiere `gh`, la CLI de GitHub, con sesión iniciada):

```bash
gh search commits --author=TU_USUARIO --author-date=2026-08-01..2026-08-30 --limit 1000 \
  --json repository --jq '.[] | .repository.fullName' | sort | uniq -c
```

Te devuelve cada repositorio con el número de commits que encontró.

> **Advertencia:** la búsqueda de GitHub solo revisa la **rama por defecto** de cada repositorio. Si trabajaste en otra rama (`dev`, `docs`, `feature/…`), esos commits no aparecen. Por eso el Paso 2 es obligatorio, y además debes acordarte de los repositorios donde trabajaste solo en ramas secundarias.
> Los commits de los días 1 y 30 pueden cambiar de lado por la zona horaria: verifícalos con el Paso 2.

**Paso 2 — obtén los commits de cada repositorio.** Para cada repositorio, desde una terminal **Git Bash**, dentro de tu clon:

```bash
# Ajusta solo estas tres líneas
AUTOR="tu-correo@ejemplo.com"                 # varios correos: "uno@x.com\|otro@y.com"
DESDE="2026-08-01T00:00:00-05:00"
HASTA="2026-08-30T23:59:59-05:00"

URL=$(git remote get-url origin | sed -E 's#^git@github.com:#https://github.com/#; s#\.git$##')
git fetch --all --prune -q
git log --all --no-merges --author="$AUTOR" --since="$DESDE" --until="$HASTA" \
  --date=iso --reverse \
  --pretty=tformat:"| [%h]($URL/commit/%h) | %ad | %s |" | tee commits.md | wc -l
```

- Se imprime **el total de commits**. Las filas ya vienen en formato de tabla y quedan en `commits.md`: ábrelo, copia las filas y pégalas en la tabla del repositorio. Luego borra `commits.md`.
- `--all` incluye **todas las ramas**. Un commit que esté en varias ramas se cuenta una sola vez.
- `--no-merges` deja por fuera los commits de fusión.
- Si el mensaje de un commit contiene el carácter `|`, reemplázalo por `/` para no romper la tabla.
- El enlace de cada commit funciona con el `URL` del repositorio **desde el que clonaste**. Si clonaste un fork, el enlace apunta a tu fork, que es lo correcto.

**Repositorios privados.** Si un repositorio es privado, indica en *Visibilidad* si el usuario `ariel5253` tiene acceso. Un commit que el instructor no puede abrir no se puede verificar.

**Qué cuenta como commit tuyo.** Solo los hechos con tu cuenta. Abre un commit en GitHub: si aparece tu foto de perfil, está vinculado. Si no aparece, tu correo de `git config user.email` no está vinculado a tu cuenta: anótalo en *Observaciones*, no lo ocultes.

**Copia el bloque de la sección 2 una vez por cada repositorio.** Si en el periodo trabajaste en un solo repositorio, deja un solo bloque.

</details>

## 1. Resumen de repositorios

| # | Repositorio | Enlace | Tipo | Visibilidad | Commits |
|---|---|---|---|---|---|
| 1 | `JustinDanielaBahamon/AlertaMujer` | https://github.com/JustinDanielaBahamon/AlertaMujer | Personal | Público (ariel5253 tiene acceso) | 20 |
| 2 | `JustinDanielaBahamon/Backend-ALERTA-MUJER` | https://github.com/JustinDanielaBahamon/Backend-ALERTA-MUJER | Personal | Público (ariel5253 tiene acceso) | 0 |
| 3 | `JustinDanielaBahamon/Frond-end-Web` | https://github.com/JustinDanielaBahamon/Frond-end-Web | Personal | Público (ariel5253 tiene acceso) | 12 |
| | **Total** | | | | **32** |

## 2. Detalle por repositorio

### 2.1 `JustinDanielaBahamon/AlertaMujer`

- **Enlace del repositorio:** https://github.com/JustinDanielaBahamon/AlertaMujer
- **Tipo:** Personal
- **Visibilidad:** Público (¿`ariel5253` tiene acceso? Sí)
- **Total de commits en el periodo:** 20
- **Qué hice (2 a 3 líneas):** Desarrollé la aplicación móvil de AlertaMujer. Implementé funcionalidades como pantalla de expiración de alerta, integración con API, mapa funcional, persistencia de contactos y mejoras de UI.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [a3be1239](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/a3be1239) | 2026-08-10 13:34:07 -0500 | The update to the activity diagrams was added |
| [af2b8ff0](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/af2b8ff0) | 2026-08-21 17:26:23 -0500 | se actualizaron algunos documentos en base al proyecto actual |
| [b6bdb99b](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/b6bdb99b) | 2026-08-27 16:07:17 -0500 | Actualizacion de informacion |
| [d093e4fe](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/d093e4fe) | 2026-09-03 12:42:28 -0500 | update srs |
| [3c9f4091](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/3c9f4091) | 2026-09-04 17:37:18 -0500 | feat:A screen was added for when the alert timer expires. |
| [a5548853](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/a5548853) | 2026-09-04 17:37:18 -0500 | feat:A screen was added for when the alert timer expires. |
| [7fde9bcb](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/7fde9bcb) | 2026-09-07 17:16:16 -0500 | develop fixed whit the section save ubication |
| [f2548779](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/f2548779) | 2026-09-07 17:16:16 -0500 | develop fixed whit the section save ubication |
| [b548a5c9](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/b548a5c9) | 2026-09-16 17:09:09 -0500 | Test with the API |
| [40f8709c](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/40f8709c) | 2026-09-16 17:09:09 -0500 | Test with the API |
| [094319d6](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/094319d6) | 2026-09-17 17:30:02 -0500 | API functionality test 2 |
| [89eb4d0d](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/89eb4d0d) | 2026-09-17 17:30:02 -0500 | API functionality test 2 |
| [459f0914](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/459f0914) | 2026-09-21 21:43:52 -0500 | fix: resolve network errors in the mock API |
| [e13b17d7](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/e13b17d7) | 2026-09-21 21:43:52 -0500 | fix: resolve network errors in the mock API |
| [e7603e7b](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/e7603e7b) | 2026-09-22 10:48:55 -0500 | feature:The functional map was added to the completed alert module |
| [9f30f4e9](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/9f30f4e9) | 2026-09-22 10:48:55 -0500 | feature:The functional map was added to the completed alert module |
| [51c49048](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/51c49048) | 2026-09-23 14:26:24 -0500 | fix: persist contacts from API |
| [0d0c2d93](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/0d0c2d93) | 2026-09-23 14:26:24 -0500 | fix: persist contacts from API |
| [a31d8ba4](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/a31d8ba4) | 2026-09-24 14:38:24 -0500 | feat: improved the map section and removed the hamburger icon |
| [31b5068a](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/31b5068a) | 2026-09-24 14:38:24 -0500 | feat: improved the map section and removed the hamburger icon |

### 2.2 `JustinDanielaBahamon/Backend-ALERTA-MUJER`

- **Enlace del repositorio:** https://github.com/JustinDanielaBahamon/Backend-ALERTA-MUJER
- **Tipo:** Personal
- **Visibilidad:** Público (¿`ariel5253` tiene acceso? Sí)
- **Total de commits en el periodo:** 0
- **Qué hice (2 a 3 líneas):** No hice commits en este repositorio durante el periodo de septiembre.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| | | |

### 2.3 `JustinDanielaBahamon/Frond-end-Web`

- **Enlace del repositorio:** https://github.com/JustinDanielaBahamon/Frond-end-Web
- **Tipo:** Personal
- **Visibilidad:** Público (¿`ariel5253` tiene acceso? Sí)
- **Total de commits en el periodo:** 12
- **Qué hice (2 a 3 líneas):** Desarrollé el frontend web administrativo de AlertaMujer. Implementé funcionalidades de gestión de zonas, usuarios, dispositivos, moderadores, evidencias y reportes. Agregé modo oscuro, soporte multiidioma y mejoras de responsividad.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [5736d79](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/5736d79) | 2026-09-16 17:13:27 -0500 | Test with the API |
| [69ade03](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/69ade03) | 2026-09-17 17:30:36 -0500 | API functionality test 2 |
| [6ce185a](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/6ce185a) | 2026-09-21 21:52:07 -0500 | fix: resolve network errors in the mock API |
| [b629797](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/b629797) | 2026-09-28 21:20:29 -0500 | fix(admin): responsive zone management and mobile sidebar drawer |
| [cc4dec6](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/cc4dec6) | 2026-09-29 18:55:40 -0500 | chore(admin): remove emergency contacts management module |
| [6079d71](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/6079d71) | 2026-09-29 20:04:53 -0500 | fix(zones): new, view and edit zone modals now display correctly |
| [361d45e](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/361d45e) | 2026-09-29 21:30:17 -0500 | feat(admin): make users and zone management screens responsive |
| [8783ce3](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/8783ce3) | 2026-09-29 22:51:46 -0500 | feat(admin): dark mode for devices, moderators, evidence and reports; higher contrast in light mode |
| [e764c29](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/e764c29) | 2026-09-29 23:29:28 -0500 | fix:Responsive issues on some screens in the administrative section were resolved. |
| [c1c3c01](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/c1c3c01) | 2026-09-30 16:07:47 -0500 | fix: resolve ngx-bootstrap dependency conflict with Angular 21 |
| [d5e5a0e](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/d5e5a0e) | 2026-09-30 19:07:33 -0500 | feat: add French and Portuguese languages, improve light mode line contrast and make topbar and buttons responsive |
| [568d1ad](https://github.com/JustinDanielaBahamon/Frond-end-Web/commit/568d1ad) | 2026-09-30 20:08:03 -0500 | fix(reports): fix New Report modal and add label to primary button |

## 3. Verificación del aprendiz

- [ ] Todos los commits listados los hice con mi cuenta (aparece mi foto de perfil en GitHub).
- [x] Incluí los commits de **todas las ramas** de cada repositorio, no solo de la rama por defecto.
- [x] Todos los commits caen entre el 1 y el 30 de septiembre de 2026 (hora Colombia).
- [x] No repetí repositorios del Informe 1 (los de mi equipo).
- [x] Cada enlace de repositorio y de commit abre en GitHub.
- [x] El total de cada repositorio coincide con el número de filas de su tabla.
- [x] En los repositorios privados indiqué si el instructor tiene acceso.

## 4. Observaciones

Los commits listados en los repositorios AlertaMujer y Frond-end-Web aparecen con el usuario `JustinDanielaBahamon` en lugar de mi usuario `JoseSebastianSuarezCumaco`. Esto ocurre porque mi correo de git (masquebugs1@gmail.com) no está vinculado a mi cuenta de GitHub. Sin embargo, estos commits son de mi autoría y fueron hechos por mí durante el desarrollo del proyecto.

---

*Declaro que la información de este informe es veraz y que los commits listados son de mi autoría.*

**Aprendiz:** Jose Sebastian Suarez Cumaco  **Fecha:** 6 de octubre de 2026
