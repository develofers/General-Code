const exec = require('child_process').exec;

exec('w32tm /resync', (error, stdout, stderr) => {
if (error) {
console.error(`exec error: ${error}`);
return;
}
console.log(`stdout: ${stdout}`);
console.error(`stderr: ${stderr}`);
});
