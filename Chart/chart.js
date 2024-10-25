const DATA_COUNT = 7;
const labels = ['January', 'February', 'March', 'April', 'May', 'June', 'July'];

const data = {
    labels: labels,
    datasets: [
        {
          label: 'Monthly Sales',
          data: [30, 50, 20, 70, 40, 60, 80],
          backgroundColor: 'rgba(75, 192, 192, 0.2)',
          borderColor: 'rgba(75, 192, 192, 1)',
          borderWidth: 2,
          backgroundColor: 'rgba(255, 99, 132, 0.2)',
        },
        {
          label: 'Monthly Salary',
          data: [10, 20, 50, 40, 50, 80, 100],
          backgroundColor: 'rgba(75, 192, 192, 0.2)',
          borderColor: 'rgba(75, 192, 192, 1)',
          borderWidth: 2,
          backgroundColor: 'rgba(54, 162, 235, 0.2)',
        }
    ]
};

const config = {
    type: 'line',
    data: data,
    options: {
        responsive: true,
        plugins: {
            title: {
                display: true,
                text: 'Monthly Sales and Salary Line Chart'
            }
        },
        scales: {
            y: {
                suggestedMin: 30,
                suggestedMax: 50,
            }
        }
    },
};

const myChart = new Chart( document.getElementById('myChart'), config
);