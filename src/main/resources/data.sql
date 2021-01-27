insert into user(name) values ('Anuj'),('Bunty'),('Carlos');
insert into follow(user_id,followed_by) values (1,2);
insert into tweet(user_id,tweet) values (1,'Hi everyone');
insert into tweets_liked(tweet_id,user_id) values (2,1);