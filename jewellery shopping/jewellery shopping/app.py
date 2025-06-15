import sqlite3
from flask import Flask, render_template, request, redirect, url_for, flash
import base64

app = Flask(__name__)
app.secret_key = "your_secret_key"

conn = sqlite3.connect("users.db")
cursor = conn.cursor()
cursor.execute("""
    CREATE TABLE IF NOT EXISTS users (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        name TEXT NOT NULL,
        email TEXT NOT NULL,
        password TEXT NOT NULL
    )
""")

cursor.execute("""
    CREATE TABLE IF NOT EXISTS books (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        title TEXT NOT NULL,
        name TEXT NOT NULL,
        price TEXT NOT NULL,
        image TEXT NOT NULL
    )
""")

cursor.execute("""
    CREATE TABLE IF NOT EXISTS orders (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        title TEXT NOT NULL,
        name TEXT NOT NULL,
        price TEXT NOT NULL,
        image TEXT NOT NULL
    )
""")

conn.commit()
conn.close()

@app.route('/')
def home():
    return redirect(url_for('signin'))

@app.route('/signup', methods=['GET', 'POST'])
def signup():
    if request.method == 'POST':
        name = request.form['name']
        email = request.form['email']
        password = request.form['password']

        conn = sqlite3.connect("users.db")
        cursor = conn.cursor()

        cursor.execute("INSERT INTO users (name, email, password) VALUES (?, ?, ?)", (name, email, password))
        conn.commit()
        conn.close()

        return render_template('signin.html', msg="Signup successfull")

    return render_template('signup.html')

@app.route('/signin', methods=['GET', 'POST'])
def signin():
    if request.method == 'POST':
        email = request.form['email']
        password = request.form['password']

        conn = sqlite3.connect("users.db")
        cursor = conn.cursor()
        cursor.execute("SELECT * FROM users WHERE email = ? AND password = ?", (email, password))
        user = cursor.fetchone()
        conn.close()

        if user:
            conn = sqlite3.connect("users.db")
            cursor = conn.cursor()
            cursor.execute("SELECT id, title, name, price, image FROM books")
            books = [{"id": row[0], "title": row[1], "name": row[2], "price": row[3], "image": row[4]} for row in cursor.fetchall()]
            conn.close()
            return render_template('books.html', books=books)
        else:
            return render_template('signin.html', msg="Invalid email or password! Try again.")

    return render_template('signin.html')

@app.route("/books")
def books():
    conn = sqlite3.connect("users.db")
    cursor = conn.cursor()
    cursor.execute("SELECT id, title, name, price, image FROM books")
    books = [{"id": row[0], "title": row[1], "name": row[2], "price": row[3], "image": row[4]} for row in cursor.fetchall()]
    conn.close()
    return render_template('books.html', books=books)

@app.route('/admin', methods=['GET', 'POST'])
def admin():
    if request.method == 'POST':
        email = request.form['email']
        password = request.form['password']
        if email == 'admin@gmail.com' and password == 'admin123':
            return render_template('upload.html')
        else:
            return render_template('admin.html', msg="Invalid email or password! Try again.")

    return render_template('admin.html')

@app.route('/upload', methods=['GET', 'POST'])
def upload():
    if request.method == 'POST':
        name = request.form['title']
        email = request.form['name']
        password = request.form['price']
        file = request.files['image']

        file_content = file.read()
        my_string1 = base64.b64encode(file_content).decode('utf-8')

        conn = sqlite3.connect("users.db")
        cursor = conn.cursor()

        cursor.execute("INSERT INTO books (title, name, price, image) VALUES (?, ?, ?, ?)", (name, email, password, my_string1))
        conn.commit()
        conn.close()

        return render_template('upload.html', msg="upload successfull")

    return render_template('upload.html')

@app.route('/buy/<Id>')
def buy(Id):
    conn = sqlite3.connect("users.db")
    cursor = conn.cursor()
    cursor.execute("SELECT title, name, price, image FROM books WHERE id = ?", (Id))
    data = cursor.fetchone()
    cursor.execute("INSERT INTO orders (title, name, price, image) VALUES (?, ?, ?, ?)", data)
    conn.commit()
    cursor.execute("SELECT id, title, name, price, image FROM orders")
    books = [{"id": row[0], "title": row[1], "name": row[2], "price": row[3], "image": row[4]} for row in cursor.fetchall()]
    conn.close()
    return render_template('orders.html', books=books)

@app.route('/orders')
def orders():
    conn = sqlite3.connect("users.db")
    cursor = conn.cursor()
    cursor.execute("SELECT id, title, name, price, image FROM orders")
    books = [{"id": row[0], "title": row[1], "name": row[2], "price": row[3], "image": row[4]} for row in cursor.fetchall()]
    conn.close()
    return render_template('orders.html', books=books)

@app.route('/cancel/<Id>')
def cancel(Id):
    conn = sqlite3.connect("users.db")
    cursor = conn.cursor()
    cursor.execute("delete from orders where id = ?",(Id))
    conn.commit()
    cursor.execute("SELECT id, title, name, price, image FROM orders")
    books = [{"id": row[0], "title": row[1], "name": row[2], "price": row[3], "image": row[4]} for row in cursor.fetchall()]
    conn.close()
    return render_template('orders.html', books=books)

@app.route("/booklist")
def booklist():
    conn = sqlite3.connect("users.db")
    cursor = conn.cursor()
    cursor.execute("SELECT id, title, name, price, image FROM books")
    books = [{"id": row[0], "title": row[1], "name": row[2], "price": row[3], "image": row[4]} for row in cursor.fetchall()]
    conn.close()
    return render_template('booklist.html', books=books)

@app.route('/delete/<Id>')
def delete(Id):
    conn = sqlite3.connect("users.db")
    cursor = conn.cursor()
    cursor.execute("delete from books where id = ?",(Id))
    conn.commit()
    cursor.execute("SELECT id, title, name, price, image FROM books")
    books = [{"id": row[0], "title": row[1], "name": row[2], "price": row[3], "image": row[4]} for row in cursor.fetchall()]
    conn.close()
    return render_template('booklist.html', books=books)

if __name__ == '__main__':
    app.run(debug=True)
