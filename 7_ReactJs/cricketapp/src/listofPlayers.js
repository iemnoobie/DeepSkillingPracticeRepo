import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 45 },
    { name: "Rahul", score: 74 },
    { name: "Pant", score: 60 },
    { name: "Hardik", score: 90 },
    { name: "Bumrah", score: 50 },
    { name: "Shami", score: 72 },
    { name: "Ashwin", score: 30 },
    { name: "Surya", score: 110 },
    { name: "Jadeja", score: 55 },
    { name: "Kuldeep", score: 40 },
  ];

  // Filter using arrow function
  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players and Scores:</h2>
      {players.map((p, i) => (
        <p key={i}>{p.name} - {p.score}</p>
      ))}

      <h3>Players Scoring Below 70:</h3>
      {below70.map((p, i) => (
        <p key={i}>{p.name} - {p.score}</p>
      ))}
    </div>
  );
};

export default ListofPlayers;
