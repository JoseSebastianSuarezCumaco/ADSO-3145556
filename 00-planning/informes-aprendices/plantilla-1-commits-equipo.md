# Report 1 — Commits in the documentation repository and in your team's repositories

**Period:** September 1 to 30, 2026 (Colombia time, UTC-5)
**Main repository of the cohort:** https://github.com/code-sena/ADSO-3145556

| Field | Value |
|---|---|
| Learner | Jose Sebastian Suarez Cumaco |
| GitHub User | JoseSebastianSuarezCumaco |
| Cohort | ADSO-3145556 |
| Project (team) | woman-alert |
| Team repository prefix | wal- |
| Email(s) used for commits | masquebugs1@gmail.com |
| Preparation date | October 6, 2026 |

<details>
<summary><strong>Instructions — read them and delete this block before submitting</strong></summary>

**What this report covers.** All commits you made in the documentation repository (`-docs`) and in the other repositories of **your team**. Commits in any other repository (personal, forks, other teams) go in Report 2.

**Important: team repositories were created on August 25, 2026.** Before that date you could not make commits in them. If your work from the first and second weeks of August was in another repository, it goes in Report 2, not here.

**Repositories for each team** (todos en la organización `code-sena`):

| Project | Prefix | Repositories |
|---|---|---|
| edu-air-control | `ea-control-` | api, db, docs, portal, **worker** |
| energy-monitor | `en-monitor-` | api, app, db, docs, portal |
| faceattend-edu | `fae-` | api, app, db, docs, portal |
| rent-car | `rtm-` | api, app, db, docs, portal |
| save-your-water | `sy-water-` | api, app, db, docs, **worker** |
| school-guardian | `sg-` | api, app, db, docs, portal |
| translates-sign-language | `trans-sl-` | api, app, db, docs, portal |
| vehicle-washing | `vehicle-w-` | api, app, db, docs, portal |
| woman-alert | `wal-` | api, app, db, docs, portal |
| your-event | `yev-` | api, app, db, docs, portal |

If your team uses `worker` instead of `app` or `portal`, change the name of the corresponding block (section 3).

**How to get your commits.** For each repository, from a **Git Bash** terminal, inside your clone of the repository:

```bash
# Adjust only these three lines
AUTOR="tu-correo@ejemplo.com"                 # multiple emails: "one@x.com\|other@y.com"
DESDE="2026-08-01T00:00:00-05:00"
HASTA="2026-08-30T23:59:59-05:00"

URL=$(git remote get-url origin | sed -E 's#^git@github.com:#https://github.com/#; s#\.git$##')
git fetch --all --prune -q
git log --all --no-merges --author="$AUTOR" --since="$DESDE" --until="$HASTA" \
  --date=iso --reverse \
  --pretty=tformat:"| [%h]($URL/commit/%h) | %ad | %s |" | tee commits.md | wc -l
```

- It prints **the total number of commits**. The rows already come in table format and are saved in the `commits.md` file: open it, copy the rows and paste them into the repository table. Then delete `commits.md`.
- `--all` includes **all branches**, not just `main`. A commit that is in several branches is counted only once.
- `--no-merges` excludes merge commits (*Merge pull request…*).
- If a commit message contains the character `|`, replace it with `/` to avoid breaking the table.
- If you don't have the repository cloned: `git clone https://github.com/code-sena/PREFIX-docs`.
- If a repository has no commits from you in the period, **leave it in the table with 0**; do not delete it.

**What counts as your commit.** Only those made with your account. Open a commit on GitHub: if your profile photo appears, it is linked. If it doesn't appear, your email from `git config user.email` is not linked to your account: note it in *Observations*, do not hide it.

</details>

## 1. Summary

| Repositorio | Enlace | Commits |
|---|---|---|
| `wal-docs` | https://github.com/code-sena/wal-docs | 5 |
| `wal-api` | https://github.com/code-sena/wal-api | 0 |
| `wal-app` | https://github.com/code-sena/wal-app | 0 |
| `wal-db` | https://github.com/code-sena/wal-db | 0 |
| `wal-portal` | https://github.com/code-sena/wal-portal | 0 |
| **Total** | | **5** |

## 2. Documentation repository

- **Repository:** `wal-docs`
- **Link:** https://github.com/code-sena/wal-docs
- **Total commits in the period:** 5
- **What I did (2 to 3 lines):** Updated project documentation including context, domain, architecture and requirements. Added files from data and architecture folders.

| Commit ID | Date and time | Message |
|---|---|---|
| [47a931e](https://github.com/code-sena/wal-docs/commit/47a931e) | 2026-09-07 14:33:45 -0500 | Update context and domain documentation |
| [fbcde77](https://github.com/code-sena/wal-docs/commit/fbcde77) | 2026-09-08 17:29:44 -0500 | docs: I am uploading the file from the data folder, and I am also uploading the files from the architecture folder. |
| [3f1dae2](https://github.com/code-sena/wal-docs/commit/3f1dae2) | 2026-09-09 21:34:34 -0500 | docs: updating the requirements |
| [8f4b901](https://github.com/code-sena/wal-docs/commit/8f4b901) | 2026-09-10 00:59:32 -0500 | docs/Architecture update |
| [a8db933](https://github.com/code-sena/wal-docs/commit/a8db933) | 2026-09-10 15:08:46 -0500 | docs:Architecture folder update |

## 3. Team repositories

### 3.1 `wal-api`

- **Link:** https://github.com/code-sena/wal-api
- **Total commits in the period:** 0
- **What I did (2 to 3 lines):**

| Commit ID | Date and time | Message |
|---|---|---|
| | | |

### 3.2 `wal-app`

- **Link:** https://github.com/code-sena/wal-app
- **Total commits in the period:** 0
- **What I did (2 to 3 lines):**

| Commit ID | Date and time | Message |
|---|---|---|
| | | |

### 3.3 `wal-db`

- **Link:** https://github.com/code-sena/wal-db
- **Total commits in the period:** 0
- **What I did (2 to 3 lines):**

| Commit ID | Date and time | Message |
|---|---|---|
| | | |

### 3.4 `wal-portal`

- **Link:** https://github.com/code-sena/wal-portal
- **Total commits in the period:** 0
- **What I did (2 to 3 lines):**

| Commit ID | Date and time | Message |
|---|---|---|
| | | |

## 4. Learner verification

- [ ] All listed commits were made by me with my account (my profile photo appears on GitHub).
- [x] I included commits from **all branches**, not just `main`.
- [x] All commits fall between September 1 and 30, 2026 (Colombia time).
- [x] Each commit link opens on GitHub.
- [x] Repositories where I have no commits are left in the table with 0.
- [x] The total of each repository matches the number of rows in its table.

## 5. Observations

<!-- Commits not linked to your account, branches with unmerged work, repositories you didn't have access to, or any other clarification. -->

---

*I declare that the information in this report is truthful and that the listed commits are of my authorship.*

**Learner:** Jose Sebastian Suarez Cumaco  **Date:** October 6, 2026
