import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';
import CurrencyConvertor from './currencyconvertor.js';

function App() {
  const [count, setCount] = useState(0);

  const handleIncrement=()=>{
    setCount(count + 1);
    console.log("Hello! This is a static message.");
  };

  const handleDecrement=()=>{
    setCount(count - 1);
  };
  
  const handleWelcome = () => {
    alert("Welcome to the Currency Convertor App!");
  };

  const handleSyntheticClick = (event) => {
    alert("I was clicked");
    console.log("Synthetic Event:", event);
  };
  
  return (
    <div className="App">
      <p>{count}</p>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>
      <button onClick={handleWelcome}>Say Welcome</button>
      <button onClick={handleSyntheticClick}>Click on me</button>

      <h2 style={{color:'green'}}>Currency Convertor !!!!</h2>
      <CurrencyConvertor />
    </div>
  );
}

export default App;
