import React from 'react';

function BookDetails() {
  const books = [
    { id: 1, name: "Master React", price: 670 },
    { id: 2, name: "Deep Dive into Angular 11", price: 800},
    { id: 3, name: "Mongo Essentials", price: 450},
  ];

  return (
    <div>
      <h2>📘 Book Details</h2>
      {books.map(book => (
        <div key={book.id}>
          <strong>{book.name}</strong>
          <p>{book.price}</p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
