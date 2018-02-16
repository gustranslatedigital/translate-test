import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';
import Unity from 'react-unity-webgl';

class App extends Component {
    render() {
        return (
            <div className="App">
                <Unity
                    src={"static/Build/Desktop.json"}
                    loader={"static/Build/UnityLoader.js"}
                />
            </div>
        );
    }
}

export default App;
