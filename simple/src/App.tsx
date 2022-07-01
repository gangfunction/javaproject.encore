import React, { useState } from 'react';
import "./components/darkmode/darkmode.css";
import Clock from "./components/sidebar/Sidebar"



const App = () => {
    const [darkMode, setDarkMode] = useState(false);
    return (
    <>
      <div className={` ${darkMode && "dark"}`}>
      <div className={` dark:bg-gray-700  h-screen w-full flex items-center justify-center  flex-col`}>
        <label htmlFor="default-toggle" className="m-10 inline-flex relative items-center cursor-pointer">
          <input type="checkbox" onClick={()=>setDarkMode(!darkMode)} value="" id="default-toggle" className="sr-only peer"/>
          <div className=" w-11 h-6 bg-gray-200 peer-focus:outline-none peer-focus:ring-4 peer-focus:ring-blue-300 dark:peer-focus:ring-blue-800 rounded-full peer dark:bg-gray-700 peer-checked:after:translate-x-full peer-checked:after:border-white after:content-[''] after:absolute after:top-[2px] after:left-[2px] after:bg-white after:border-gray-300 after:border after:rounded-full after:h-5 after:w-5 after:transition-all dark:border-gray-600 peer-checked:bg-blue-600">
          </div>

        </label>
        <Clock/>
        <div className=" p-3 grid gap-4 grid-cols-2 grid-rows-3">
          <nav className="dark:bg-gray-100  p-20 text-center border ">
            영화조회
          </nav>
          <nav className=" dark:bg-gray-100  rounded-lg p-20 text-center border">
            리뷰조회
          </nav>
          <nav className=" dark:bg-gray-100  rounded-lg p-20 text-center border ">
            영화예매
          </nav>
          <nav className=" dark:bg-gray-100 rounded-lg p-20 text-center border">
            회원가입
          </nav>
        </div>
        <div className="m-12 border flex justify-center">Hello world</div>
      </div>
      </div>
    </>
  );
};

export default App;