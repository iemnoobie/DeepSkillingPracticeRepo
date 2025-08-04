import ListofPlayers from './listofPlayers.js';
import IndianPlayers  from './indianPlayers.js';
import React from 'react';
import { useState } from 'react';
import './App.css';


function App() {
  const [flag, setFlag] = useState(true);

  function handleClick() {
  setFlag(!flag);
  }

  return (
    <div className="App">
      <h1>CricketApp</h1>
      {flag? <ListofPlayers/> : <IndianPlayers/>}
      <button onClick={handleClick}>Click to change the List</button>

      
    </div>
  );
}

export default App;
