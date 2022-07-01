import React, { useState, useEffect } from 'react';
import moment from 'moment';
function Clock() {
  let timer: any = null;
  const [time, setTime] = useState(moment());
  useEffect(() => {
    timer = setInterval(() => {setTime(moment());}, 1000);
    return () => {
      clearInterval(timer);
    };
  }, []);

  return (
    <div>
      <div className="dark:text-gray-100"> {time.format('dddd')}    {time.format('HH:mm:ss')}</div>
    </div>
  );
}

export default Clock;