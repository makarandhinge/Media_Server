

```markdown
# 🎬 Media Server MVP

A custom-built media server that scans your local media folder, stores file metadata, and streams video/audio files through a simple web UI.

This is an MVP (Minimum Viable Product) version being developed step-by-step with a focus on learning, clean architecture, and continuous improvement.

---

## 🚀 Features (MVP)

- ✅ Scans media folder for video/audio/image files
- ✅ Stores metadata (name, path, size, type) in PostgreSQL
- ✅ REST APIs to list and stream media files
- ✅ React frontend to display media list
- ✅ Direct streaming via HTTP with seek support
- 🟡 Fast local-only setup (no remote/cloud requirements)

---

## 🧠 Tech Stack

| Layer     | Technology         |
|-----------|--------------------|
| Backend   | Java, Spring Boot  |
| Database  | PostgreSQL         |
| Frontend  | React.js (Vite or CRA) |
| Storage   | Local filesystem   |
| Streaming | HTTP (with `Range` header support) |

---

## ⚙️ Setup Instructions

### 🐘 PostgreSQL

1. Create a database:
    ```sql
    CREATE DATABASE media_server;
    CREATE USER media_user WITH PASSWORD 'yourpassword';
    GRANT ALL PRIVILEGES ON DATABASE media_server TO media_user;
    ```

2. Update the following in `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/media_server
    spring.datasource.username=media_user
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

---

### ☕ Backend (Spring Boot)

```bash
cd media-server-backend
./mvnw spring-boot:run
````

* Server runs on `http://localhost:8080`

---

### 🌐 Frontend (React)

```bash
cd media-server-frontend
npm install
npm run dev
```

* Frontend runs on `http://localhost:5173`
* Connects to backend APIs to fetch and stream media

---

## 📦 How It Works

1. Media files are placed inside a configured folder (e.g., `/media`)
2. Java scans the folder and stores metadata into PostgreSQL
3. React fetches the list of media via REST API
4. Clicking on a media file plays it in the browser

---

## 🧱 Future Improvements (Post-MVP)

* [ ] HLS Streaming with FFmpeg
* [ ] Watch History + Resume Playback
* [ ] User Authentication (JWT)
* [ ] Metadata enrichment via TMDb API
* [ ] Thumbnail and subtitle support
* [ ] Remote access configuration

---

## 👨‍💻 Developer Workflow

1. Use the **GitHub Project Board** to track features
2. Tasks are managed using **Draft Cards**, and converted to issues if needed
3. Work is done in small, testable sprints (Agile-inspired)
4. Each feature is added, tested, then improved

---

## 🤝 Contributing

This project is being built step-by-step as a learning tool and foundation for a personal media server.

If you're contributing:

* Keep commits focused and well-commented
* Write clean and readable code
* Stick to RESTful practices and React component structure

---

## 📜 License

MIT – Feel free to use, extend, and improve.

---


