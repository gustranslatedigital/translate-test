import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';
import Unity from 'react-unity-webgl';

class App extends Component {
    render() {
        return (
            <div className="App">
                <Unity
                    src={"Build/Desktop.json"}
                    loader={"Build/UnityLoader.js"}
                />
            </div>
        );
    }
}

export default App;
