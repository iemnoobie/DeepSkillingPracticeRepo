import logo from './logo.svg';
import './App.css';

function App() {
  const offices = [
    { name: 'DLF The Galleria',
      address: 'New Town, Kolkata',
      rent: 100000,
      image: 'https://imagecdn.99acres.com/media1/30421/18/608438589O-1750241930519.jpg'
    },
    { name: 'PS Abacus',
      address: 'Rajarhat, Kolkata',
      rent: 115000,
      image: 'https://imagecdn.99acres.com/media1/29774/3/595483053O-1747128927723.jpg'
    },
    {
      name: 'Space Ergo',
      address: 'Ergo Tower, Block- Ep & Gp, Plot No-A1-4, Sector-V, Salt Lake, Kolkata',
      rent: 100000,
      image: 'https://imagecdn.99acres.com/media1/28615/7/572307445O-1740398552880.jpg'
    }
  ];

  return (
    <div className="App">
      <h1>Office Spaces for Rent in Kolkata</h1>
      {offices.map((office, index)=>(
        <div key={index} className="office-card">
          <img src={office.image} alt={office.name} className="office-image"/>
          <div className="office-details">
            <h2>{office.name}</h2>
            <h3>{office.address}</h3>
            <p style={{ color: office.rent > 100000 ? 'red' : 'green' }}>
              Rent:₹{office.rent}
            </p>
          </div> 
        </div>
      ))}
    </div>
  );
}

export default App;
