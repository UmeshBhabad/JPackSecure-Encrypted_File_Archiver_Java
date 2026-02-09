<body>

  <h1>📦 File Packer – Unpacker</h1>

  <h2>📌 Project Description</h2>
  <p>
    <strong>File Packer – Unpacker</strong> is a Java-based system utility project used to perform
    process monitoring and file management activities. The project allows users to
    merge multiple files from a directory into a single packed file and later extract
    them back to their original form whenever required.
  </p>

  <p>
    The system is designed to optimize memory usage, ensure data security using encryption,
    and maintain file integrity using checksum verification.
  </p>

  <h2>🎯 Objectives</h2>
  <ul>
    <li>Merge a large number of files into a single file efficiently</li>
    <li>Avoid memory wastage during file handling</li>
    <li>Provide data security using encryption techniques</li>
    <li>Maintain file integrity using checksum verification</li>
    <li>Enable easy extraction of original files</li>
  </ul>

  <h2>🖥️ Platform Requirements</h2>
  <ul>
    <li><strong>Operating System:</strong> Windows NT / Linux</li>
    <li><strong>Processor:</strong> Intel 32-bit Processor</li>
  </ul>

  <h2>🧩 Architectural Requirements</h2>
  <ul>
    <li>Directory-based file traversal</li>
    <li>Byte-level file handling</li>
    <li>Header-based file structure</li>
    <li>Encryption and decryption mechanism</li>
  </ul>

  <h2>🖱️ User Interface</h2>
  <p>Graphical User Interface (GUI)</p>

  <h2>🛠️ Technology Used</h2>
  <ul>
    <li>Java Programming</li>
    <li>java.io.File</li>
    <li>FileInputStream</li>
    <li>FileOutputStream</li>
  </ul>

  <h2>✨ Features of File Packer – Unpacker</h2>
  <ul>
    <li>Directory traversal and file access</li>
    <li>Packing and unpacking of files</li>
    <li>XOR-based encryption and decryption</li>
    <li>Header-based metadata storage</li>
    <li>Log file generation</li>
    <li>Packing and unpacking reports</li>
    <li>MD5 checksum verification</li>
    <li>Primary header and magic number validation</li>
  </ul>

  <h2>📦 Project Modules</h2>

  <h3>1️⃣ Packing Activity</h3>
  <ul>
    <li>Accept directory name and output file name from user</li>
    <li>Create a new packed file</li>
    <li>Traverse all files in the directory</li>
    <li>Write metadata (file name, size, checksum) as header</li>
    <li>Write actual file data sequentially</li>
    <li>Encrypt data using XOR operation</li>
    <li>Create log file in system directory</li>
    <li>Display packing report</li>
  </ul>

  <h3>2️⃣ Unpacking Activity</h3>
  <ul>
    <li>Accept packed file name from user</li>
    <li>Authenticate packed file using magic number</li>
    <li>Read header and create new files</li>
    <li>Decrypt data using XOR operation</li>
    <li>Write data to corresponding files</li>
    <li>Verify data integrity using MD5 checksum</li>
    <li>Display unpacking report</li>
  </ul>

  <h2>🔐 Security Features</h2>
  <ul>
    <li>XOR-based Encryption with hexadecimal key</li>
    <li>MD5 checksum verification</li>
    <li>Primary header validation</li>
    <li>Magic number authentication</li>
  </ul>

  <h2>🚀 Key Advantages</h2>
  <ul>
    <li>Efficient handling of large number of files</li>
    <li>Reduced memory consumption</li>
    <li>Secure file storage and extraction</li>
    <li>Platform-independent Java implementation</li>
  </ul>

  <h2>📌 Conclusion</h2>
  <p>
    The File Packer – Unpacker project provides an efficient and secure way to manage
    multiple files by packing them into a single file and restoring them when needed.
    It ensures performance optimization and data security using Java file handling,
    encryption, and checksum verification.
  </p>

  <footer>
    ☕ Keep learning, keep coding!
  </footer>

  </br>

  <ul>
    <li>🌱 I’m currently learning <strong>Java Language</strong></li></br>
    <li>📫 How to reach me <strong>umeshbhabad9@gmail.com</strong></li>
  </ul>

  <p align="left"></p>

  <h3 align="left">Languages and Tools:</h3>
  <p align="left">
    <a href="https://git-scm.com/" target="_blank" rel="noreferrer">
      <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg"
           alt="git" width="40" height="40"/>
    </a>
    <a href="https://www.java.com" target="_blank" rel="noreferrer">
      <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg"
           alt="java" width="40" height="40"/>
    </a>
  </p>

</body>
</html>
