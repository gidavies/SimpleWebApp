var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Simple Web App' });
});

module.exports = router;

// Route to handle POST request to create a new user
// Path: routes/users.js

/* POST users listing. */
router.post('/', function(req, res, next) {
  res.send('Create new user');
});
