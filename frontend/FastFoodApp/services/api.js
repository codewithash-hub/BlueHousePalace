import axios from 'axios';

const BASE_URL = 'http://192.168.1.100:8080';

const api = axios.create({
  baseURL: BASE_URL,
  headers: {
    'Content-Type': 'application/json',
  }
});

export const getMenu = () => api.get('/menu');
export const registerUser = (data) => api.post('/auth/register', data);
export const loginUser = (data) => api.post('/auth/login', data);