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