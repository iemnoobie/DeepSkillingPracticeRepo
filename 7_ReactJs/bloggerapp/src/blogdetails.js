import React from 'react';

function BlogDetails() {
  const blogs = [
    { id: 1, title: "React learning", author: "Stephen Biz", body: "Welcome to learning react" },
    { id: 2, title: "Installation", author: "Schewzdenier", body: "You can install react using npm" },
  ];

  return (
    <div>
      <h2>📝 Blog Details</h2>
      {blogs.map(blog => (
        <div key={blog.id}>
            <h2>{blog.title}</h2>
            <p>{blog.author}</p>
            <p>{blog.body}</p>
            </div>
      ))}
    </div>
  );
}

export default BlogDetails;
