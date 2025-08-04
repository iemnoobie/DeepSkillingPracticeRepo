import React from "react";

const IndianPlayers = () => {
  const oddPlayers = ["Virat", "Rahul", "Pant", "Hardik", "Ashwin"];
  const evenPlayers = ["Rohit", "Bumrah", "Shami", "Surya", "Jadeja", "Kuldeep"];

  const [p1, p2, ...restOdd] = oddPlayers;
  const [e1, e2, ...restEven] = evenPlayers;

  const T20players = ["Virat", "Rohit", "Pant"];
  const RanjiTrophy = ["Rahane", "Pujara"];
  const allPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players:</h2>
      {[p1, p2, ...restOdd].map((player, i) => <p key={i}>{player}</p>)}

      <h2>Even Team Players:</h2>
      {[e1, e2, ...restEven].map((player, i) => <p key={i}>{player}</p>)}

      <h2>Merged Team (T20 + Ranji):</h2>
      {allPlayers.map((p, i) => <p key={i}>{p}</p>)}
    </div>
  );
};

export default IndianPlayers;
