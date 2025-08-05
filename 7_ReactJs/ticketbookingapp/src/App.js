import logo from './logo.svg';
import './App.css';
import GuestPage from './guestpage.js';
import UserPage from './user.js';
import React, {useState} from 'react';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [username, setUsername] = useState('');

  let handleClick=() =>{
    setIsLoggedIn(!isLoggedIn);
    //setUsername()
  }

  let content;
  if (isLoggedIn) {
    content = <UserPage uname={username} />;
  } else {
    content = <GuestPage />;
  }

  return (
    <div>
      <h1>Book tickets at ease</h1>
      {content}

       {!isLoggedIn && (
      <>
        <input
          id={'my-input'}
          type={'text'}
          value={username}
          placeholder={'Enter name'}
          onChange={event => {
            setUsername(event.target.value)
          }}
        />
        <button onClick={handleClick}>Log In</button>
      </>
    )}

    
    {isLoggedIn && (
      <button onClick={() => setIsLoggedIn(false)}>Log Out</button>
    )}
    
    </div>
  );
}

export default App;
