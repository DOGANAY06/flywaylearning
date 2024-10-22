
CREATE TABLE il (
                    id SERIAL PRIMARY KEY,
                    isim VARCHAR(255)
);

CREATE TABLE ilce (
                      id SERIAL PRIMARY KEY,
                      isim VARCHAR(255),
                      il_id BIGINT,
                      FOREIGN KEY (il_id) REFERENCES il(id)
);

CREATE TABLE kisi (
                      id SERIAL PRIMARY KEY,
                      ad VARCHAR(255),
                      soyad VARCHAR(255)
);

CREATE TABLE ikametgah (
                           id SERIAL PRIMARY KEY,
                           kisi_id BIGINT,
                           ilce_id BIGINT,
                           FOREIGN KEY (kisi_id) REFERENCES kisi(id),
                           FOREIGN KEY (ilce_id) REFERENCES ilce(id)
);
