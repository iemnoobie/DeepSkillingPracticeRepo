import CalculatorScore from './components/calculateScore.js';
import './App.css';

function App() {
  return (
    <div className="App">
      <CalculatorScore Name="Steeve" 
      School={"DNV High SChool"}
      total={284} 
      goal={3} 
      />
    </div>
  );
}

export default App;
