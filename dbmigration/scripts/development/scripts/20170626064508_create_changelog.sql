-- // Create Changelog

CREATE TABLE ${changelog} (
  ID BIGINT NOT NULL,
APPLIED_AT VARCHAR(25) NOT NULL,
DESCRIPTION VARCHAR(255) NOT NULL,
PRIMARY KEY (`ID`)
);


-- //@UNDO

DROP TABLE ${changelog};