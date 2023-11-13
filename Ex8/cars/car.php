<!DOCTYPE html>
<html>
<head>
    <title>Car Info</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 20px;
            background-repeat: no-repeat;
            background-size: cover;
            
        }
        h1 {
            text-align: center;
            color: white;
        }
        ul {
            list-style-type: none;
            padding: 0;
            margin: 0;
        }
        li {
            background-color:gray;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin: 10px;
            padding: 10px;
        }
    </style>
</head>
<body background= "carbg.gif">
    <h1>List of cars</h1>
    <ul>


    <?php
    $xmlFile = "car.xml"; // Your XML file


    if (file_exists($xmlFile)) {
        $xml = simplexml_load_file($xmlFile);


        if ($xml) {
            foreach ($xml->car as $car) {
                $brand = $car->brand;
                $model = $car->model;
                $type = $car->type;
                echo "<li>$brand ($type) - model is $model</li>";
            }
        } else {
            echo "Error loading XML data";
        }
    } else {
        echo "XML file not found";
    }
    ?>
    </ul>
</body>
</html>
