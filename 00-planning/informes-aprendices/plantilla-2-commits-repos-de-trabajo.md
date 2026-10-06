# Report 2 — Commits in the repositories you worked on

**Period:** September 1 to 30, 2026 (Colombia time, UTC-5)
**Main repository of the cohort:** https://github.com/code-sena/ADSO-3145556

| Field | Value |
|---|---|
| Learner | Jose Sebastian Suarez Cumaco |
| GitHub User | JoseSebastianSuarezCumaco |
| Cohort | ADSO-3145556 |
| Project (team) | woman-alert |
| Email(s) used for commits | masquebugs1@gmail.com |
| Preparation date | October 6, 2026 |

<details>
<summary><strong>Instructions — read them and delete this block before submitting</strong></summary>

**What this report covers.** All commits you made in **the other repositories you worked on**: your personal or profile repository, your fork of `ADSO-3145556`, repositories from other teams, `design-software` and any other. **Do not repeat here** your team's repositories (`-docs`, `-api`, `-app`, `-db`, `-portal`, `-worker`): those go in Report 1.

**Repository types** (use them in the *Type* column): `Personal` · `Fork of the cohort` · `Other team` · `design-software` · `Other`.

**Step 1 — discover which repositories you worked on.** Choose one of the two methods (replace `YOUR_USER`):

- *From the browser:* open
  `https://github.com/search?q=author%3AYOUR_USER+author-date%3A2026-08-01..2026-08-30&type=commits`
  and see in which repositories your commits appear.
- *From the terminal* (requires `gh`, the GitHub CLI, with active session):

```bash
gh search commits --author=TU_USUARIO --author-date=2026-08-01..2026-08-30 --limit 1000 \
  --json repository --jq '.[] | .repository.fullName' | sort | uniq -c
```

It returns each repository with the number of commits it found.

> **Warning:** GitHub search only reviews the **default branch** of each repository. If you worked on another branch (`dev`, `docs`, `feature/…`), those commits do not appear. That's why Step 2 is mandatory, and you must also remember the repositories where you worked only on secondary branches.
> Commits from days 1 and 30 may change sides due to time zone: verify them with Step 2.

**Step 2 — get the commits from each repository.** For each repository, from a **Git Bash** terminal, inside your clone:

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

- It prints **the total number of commits**. The rows already come in table format and are saved in `commits.md`: open it, copy the rows and paste them into the repository table. Then delete `commits.md`.
- `--all` includes **all branches**. A commit that is in several branches is counted only once.
- `--no-merges` excludes merge commits.
- If a commit message contains the character `|`, replace it with `/` to avoid breaking the table.
- The link of each commit works with the `URL` of the repository **from which you cloned**. If you cloned a fork, the link points to your fork, which is correct.

**Private repositories.** If a repository is private, indicate in *Visibility* whether the user `ariel5253` has access. A commit that the instructor cannot open cannot be verified.

**What counts as your commit.** Only those made with your account. Open a commit on GitHub: if your profile photo appears, it is linked. If it doesn't appear, your email from `git config user.email` is not linked to your account: note it in *Observations*, do not hide it.

**Copy the block from section 2 once for each repository.** If you worked on only one repository in the period, leave a single block.

</details>

## 1. Repository summary

| # | Repository | Link | Type | Visibility | Commits |
|---|---|---|---|---|---|
| 1 | `JustinDanielaBahamon/AlertaMujer` | https://github.com/JustinDanielaBahamon/AlertaMujer | Personal | Public (ariel5253 has access) | 20 |
| 2 | `JustinDanielaBahamon/Backend-ALERTA-MUJER` | https://github.com/JustinDanielaBahamon/Backend-ALERTA-MUJER | Personal | Public (ariel5253 has access) | 0 |
| 3 | `JustinDanielaBahamon/Frond-end-Web` | https://github.com/JustinDanielaBahamon/Frond-end-Web | Personal | Public (ariel5253 has access) | 12 |
| | **Total** | | | | **32** |

## 2. Detail by repository

### 2.1 `JustinDanielaBahamon/AlertaMujer`

- **Repository link:** https://github.com/JustinDanielaBahamon/AlertaMujer
- **Tipo:** Personal
- **Visibility:** Public (Does `ariel5253` have access? Yes)
- **Total commits in the period:** 20
- **What I did (2 to 3 lines):** Developed the AlertaMujer mobile application. Implemented features such as alert expiration screen, API integration, functional map, contact persistence and UI improvements.

| Commit ID | Date and time | Message |
|---|---|---|
| [a3be1239](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/a3be1239) | 2026-08-10 13:34:07 -0500 | The update to the activity diagrams was added |
| [af2b8ff0](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/af2b8ff0) | 2026-08-21 17:26:23 -0500 | updated some documents based on the current project |
| [b6bdb99b](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/b6bdb99b) | 2026-08-27 16:07:17 -0500 | Information update |
| [d093e4fe](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/d093e4fe) | 2026-09-03 12:42:28 -0500 | update srs |
| [3c9f4091](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/3c9f4091) | 2026-09-04 17:37:18 -0500 | feat:A screen was added for when the alert timer expires. |
| [a5548853](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/a5548853) | 2026-09-04 17:37:18 -0500 | feat:A screen was added for when the alert timer expires. |
| [7fde9bcb](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/7fde9bcb) | 2026-09-07 17:16:16 -0500 | develop fixed with the section save location |
| [f2548779](https://github.com/JustinDanielaBahamon/AlertaMujer/commit/f2548779) | 2026-09-07 17:16:16 -0500 | develop fixed with the section save location |
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

- **Repository link:** https://github.com/JustinDanielaBahamon/Backend-ALERTA-MUJER
- **Tipo:** Personal
- **Visibility:** Public (Does `ariel5253` have access? Yes)
- **Total commits in the period:** 0
- **What I did (2 to 3 lines):** I did not make commits in this repository during the September period.

| Commit ID | Date and time | Message |
|---|---|---|
| | | |

### 2.3 `JustinDanielaBahamon/Frond-end-Web`

- **Repository link:** https://github.com/JustinDanielaBahamon/Frond-end-Web
- **Tipo:** Personal
- **Visibility:** Public (Does `ariel5253` have access? Yes)
- **Total commits in the period:** 12
- **What I did (2 to 3 lines):** Developed the AlertaMujer administrative web frontend. Implemented zone, user, device, moderator, evidence and report management features. Added dark mode, multi-language support and responsiveness improvements.

| Commit ID | Date and time | Message |
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

## 3. Learner verification

- [ ] All listed commits were made by me with my account (my profile photo appears on GitHub).
- [x] I included commits from **all branches** of each repository, not just the default branch.
- [x] All commits fall between September 1 and 30, 2026 (Colombia time).
- [x] I did not repeat repositories from Report 1 (my team's repositories).
- [x] Each repository and commit link opens on GitHub.
- [x] The total of each repository matches the number of rows in its table.
- [x] For private repositories I indicated whether the instructor has access.

## 4. Observations

The commits listed in the AlertaMujer and Frond-end-Web repositories appear with the user `JustinDanielaBahamon` instead of my user `JoseSebastianSuarezCumaco`. This happens because my git email (masquebugs1@gmail.com) is not linked to my GitHub account. However, these commits are of my authorship and were made by me during the project development.

---

*I declare that the information in this report is truthful and that the listed commits are of my authorship.*

**Learner:** Jose Sebastian Suarez Cumaco  **Date:** October 6, 2026
