import { useEffect, useState } from 'react';
import { Container, Table, Badge, Form, Button, ProgressBar, Image } from 'react-bootstrap';
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import Card from "react-bootstrap/Card";
import 'bootstrap/dist/css/bootstrap.min.css';
export default function Users() {
  const [users, setUser] = useState([]);
  let isMounted=true;
  useEffect(() => {
    fetch('http://localhost:8080/api/user')
      .then((res) => res.json())
      .then((data) => {
        if(isMounted)setUser(data);
      })
      return()=>{
        isMounted=false;
      };
  }, [])

  return (
    <div className="container">
  <h1 className="mt-3 text-center">Danh sách User</h1>

  <div className="row g-4">
    {users.map((u, index) => (
      <div className="col-12 col-sm-6 col-lg-4" key={index}>
        <div className="card shadow-sm h-100">
          <div className="card-body">
            <h5 className="fw-bold">{u.fullName}</h5>
            <p className="mb-1 text-muted small">{u.email}</p>
            <p className="mb-1 small">SĐT: {u.phone}</p>
            <p className="mb-1 small">Địa chỉ: {u.address}</p>

            <img
              src={u.image}
              alt="user"
              className="img-fluid rounded mt-2"
            />
          </div>
        </div>
      </div>
    ))}
  </div>
</div>


  );

}