import { RouterProvider } from 'react-router-dom';
import './assets/css/App.css';
import Router from './routes/router';

export default function App() {
  return (
    <>
      <RouterProvider router={Router} />
    </>
  )
}