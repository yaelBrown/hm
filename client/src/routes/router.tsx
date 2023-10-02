import { Route, createBrowserRouter, createRoutesFromElements } from "react-router-dom"

import Home from '../views/Home'
import Error from '../views/Error'
import Dashboard from '../views/Dashboard'
import Login from '../views/Login'
import Signup from '../views/Signup'
import Profile from '../views/dashboard/Profile'
import Stats from '../views/dashboard/Stats'

const Router = createBrowserRouter(
  createRoutesFromElements(
    <>
      <Route index element={<Home />} />
      <Route path="dashboard" element={<Dashboard />} />
      <Route path="profile" element={<Profile />} />
      <Route path="stats" element={<Stats />} />
      <Route path="login" element={<Login />} />
      <Route path="signup" element={<Signup />} />
      <Route path="*" element={<Error />} />
    </>
  )
)

export default Router;
