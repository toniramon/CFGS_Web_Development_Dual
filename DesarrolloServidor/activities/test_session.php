<?php 
session_start();
if (isset($_SESSION['toni'])) {
    $_SESSION['toni'] = $_SESSION['toni'] + 1;
} else {
    $_SESSION['toni'] = 1;
}

print_r($_SESSION);
// Donde guardamos la cookie.
echo ini_get("session.save_path");
?>
