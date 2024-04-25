# Database Schema
CHATGPT

## User
This table stores user data. Each user has a unique UserId, a Username, an Email, a Password, and a SignUpDate.

User
----
UserId (Primary Key)
Username
Email
Password
SignUpDate

## Post
This table stores posts made by users. Each post has a unique PostId, a UserId (which links to the User who made the post), the Content of the post, and the PostDate.

Post
----
PostId (Primary Key)
UserId (Foreign Key - references User.UserId)
Content
PostDate

## Comment
This table stores comments made by users on posts. Each comment has a unique CommentId, a UserId (which links to the User who made the comment), a PostId (which links to the Post on which the comment was made), the Content of the comment, and the CommentDate.

Comment
-------
CommentId (Primary Key)
UserId (Foreign Key - references User.UserId)
PostId (Foreign Key - references Post.PostId)
Content
CommentDate

## Like
This table stores likes on posts. Each like has a unique LikeId, a UserId (which links to the User who made the like), and a PostId (which links to the Post that was liked).

Like
----
LikeId (Primary Key)
UserId (Foreign Key - references User.UserId)
PostId (Foreign Key - references Post.PostId)

## Follow
This table stores follow relationships between users. Each follow relationship has a unique FollowId, a FollowerUserId (which links to the User who is following), a FollowedUserId (which links to the User who is being followed), and a FollowDate (the date when the follow action took place).

Follow
------
FollowId (Primary Key)
FollowerUserId (Foreign Key - references User.UserId)
FollowedUserId (Foreign Key - references User.UserId)
FollowDate

## Relationships
1. User and Post: One User can have many Posts, but each Post is associated with one User. This is a One-to-Many relationship from User to Post.
2. User and Comment: One User can have many Comments, but each Comment is associated with one User. This is a One-to-Many relationship from User to Comment.
3. Post and Comment: One Post can have many Comments, but each Comment is associated with one Post. This is a One-to-Many relationship from Post to Comment.
4. User and Like: One User can have many Likes, but each Like is associated with one User. This is a One-to-Many relationship from User to Like.
5. Post and Like: One Post can have many Likes, but each Like is associated with one Post. This is a One-to-Many relationship from Post to Like.
6. User and Follow (as Follower): One User can follow many other Users, but each Follow record has one Follower. This is a One-to-Many relationship from User to Follow on the FollowerUserId.
7. User and Follow (as Followed): One User can be followed by many other Users, but each Follow record has one Followed user. This is a One-to-Many relationship from User to Follow on the FollowedUserId.