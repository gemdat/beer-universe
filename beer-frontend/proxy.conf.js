module.exports = [
  {
     context: ["/api/**"],
     target: 'http://localhost:8080',
     changeOrigin: true,
  }
];