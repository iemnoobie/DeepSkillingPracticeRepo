import '../Stylesheets/mystyle.css';

function calulcateScore({Name,School,total,goal}) {
    const percentToDecimal=(decimal)=>{
        return (decimal.toFixed(2)+'%');
    }

    const calcScore=(total, goal)=>{
        return  percentToDecimal(total/goal);
    }

  return(
    <div className="formatStyle">
        <h1><font color="Brown">Student Details</font></h1>
        <div className="Name">
            <b><span>Name:</span></b>
            <span>{Name}</span>
        </div>
        <div className="School">
            <b><span>School:</span></b>
            <span>{School}</span>
        </div>
        <div classname="Total">
            <b><span>Total:</span></b>
            <span>{total}</span>
            <span>Marks</span>
        </div>
        <div className="Score">
            <b><span>Score:</span></b>
            <span>{calcScore(total, goal)}</span>
        </div>

    </div>
  );
}

export default calulcateScore;