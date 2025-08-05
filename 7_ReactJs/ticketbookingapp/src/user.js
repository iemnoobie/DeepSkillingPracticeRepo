function UserPage(props) {
    let handleOnClick=()=>{
        alert(`Booking flight for ${props.uname}`);
    }
    return (
        <div>
            <h2>Welcome <span style={{color:'orange'}}> {props.uname}</span></h2>
            <p>You are now logged in. You can book your tickets.</p>
            <button onClick={handleOnClick}>Book Flight A</button>
            <button onClick={handleOnClick}>Book Flight B</button>
            <button onClick={handleOnClick}>Book Flight C</button>
        </div>
    );
}
export default UserPage;