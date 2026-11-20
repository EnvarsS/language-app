-- liquibase formatted sql
-- changeset envars:001

CREATE TABLE users (
    id CHAR(36) PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE CHECK(TRIM(username) <> ''),
    preferred_language_code VARCHAR(10) NOT NULL CHECK (preferred_language_code REGEXP '^[a-z]{2,3}(-[A-Z]{2})?$'),
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL
)