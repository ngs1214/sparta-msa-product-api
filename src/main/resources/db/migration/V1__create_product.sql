CREATE TABLE products (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(50) NOT NULL,
                          price DOUBLE NOT NULL,
                          stock BIGINT NOT NULL,
                          delete_flag TINYINT DEFAULT 0 NOT NULL COMMENT 'N=0,Y=1',
                          created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                          updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);