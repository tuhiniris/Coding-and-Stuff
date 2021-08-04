import sqlite3
con = sqlite3.connect('tutorial.db')
cur = con.cursor()

'''
cur.execute("INSERT INTO stocks VALUES ('2006-01-05','BUY','RHAT',100,35.14)")
cur.execute("INSERT INTO stocks VALUES ('2006-01-05','SELL','IBM',100,35.14)")
cur.execute("INSERT INTO stocks VALUES ('2006-01-05','BUY','TCS',100,35.14)")
# Save (commit) the changes
con.commit()
'''
# We can also close the connection if we are done with it.
# Just be sure any changes have been committed or they will be lost.


for row in cur.execute('SELECT * FROM stocks ORDER BY price'):
	print(row)

con.close()	
