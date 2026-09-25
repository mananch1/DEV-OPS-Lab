FROM astral/uv:python3.12-bookworm-slim

WORKDIR /app

COPY . .

RUN uv sync --locked

ENV APP_VERSION=1.0

EXPOSE 8000

CMD ["uv", "run", "uvicorn", "main:app","--host", "0.0.0.0", "--port", "8000"]