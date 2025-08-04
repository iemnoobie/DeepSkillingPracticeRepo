import React, { useState } from 'react';

function CurrencyConvertor() {
    const [inr, setInr] = useState('');
    const [euro, setEuro] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault(); 
        const converted = parseFloat(inr) * 0.011; 
        setEuro(converted.toFixed(2));
    };
    return (
        <div>
            <form onSubmit={handleSubmit}>
                <label>Enter Amount: </label>
                <input
                    type="number"
                    value={inr}
                    onChange={(e) => setInr(e.target.value)}
                />
                <button type="submit">Convert</button>
            </form>
            {euro && <p>In Euro: €{euro}</p>}
        </div>
    );
}

export default CurrencyConvertor;