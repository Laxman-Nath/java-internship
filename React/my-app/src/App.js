import { useEffect, useState } from "react";
import Message from "./Message.js";
export default function App() {
  const [advice, setAdvice] = useState("");
  const [count, setCount] = useState(0);
  async function getAdvice() {
    const res = await fetch("https://api.adviceslip.com/advice");
    const data = await res.json();
    console.log(data.slip.advice);
    setAdvice(data.slip.advice);
    setCount((c) => c + 1);
  }
  useEffect(function () {
    getAdvice();
  }, []);

  return (
    <>
      <h1>{advice}</h1>
      <p>Welcome to react course</p>
      <button onClick={getAdvice}>Get advice</button>
      {/* <p>You have pressed {count} times</p> */}
      <Message count={count} />
    </>
  );
}


