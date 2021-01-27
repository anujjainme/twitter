DROP TABLE IF EXISTS user;
create table user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS tweet;
create table tweet (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  user_id INT NOT NULL,
  tweet VARCHAR(140) NOT NULL
);

DROP TABLE IF EXISTS tweets_liked;
create table tweets_liked (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  tweet_id INT NOT NULL,
  user_id INT NOT NULL
);

DROP TABLE IF EXISTS follow;
create table follow (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  followed_by INT NOT NULL,
  user_id INT NOT NULL
);

